package com.github.yuri0x7c1.ofbiz.explorer.service.ui.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.i18n.I18N;
import org.vaadin.viritin.button.MButton;

import com.github.yuri0x7c1.ofbiz.explorer.common.navigation.util.NavigationUtil;
import com.github.yuri0x7c1.ofbiz.explorer.common.ui.view.CommonView;
import com.github.yuri0x7c1.ofbiz.explorer.entity.xml.Entity;
import com.github.yuri0x7c1.ofbiz.explorer.entity.xml.Field;
import com.github.yuri0x7c1.ofbiz.explorer.service.xml.Attribute;
import com.github.yuri0x7c1.ofbiz.explorer.service.xml.AutoAttributes;
import com.github.yuri0x7c1.ofbiz.explorer.service.xml.Service;
import com.github.yuri0x7c1.ofbiz.explorer.util.OfbizInstance;
import com.github.yuri0x7c1.ofbiz.explorer.util.OfbizUtil;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.themes.ValoTheme;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringView(name = ServiceDetailView.NAME)
public class ServiceDetailView extends CommonView implements View {
	private static final long serialVersionUID = 719002900696360148L;

	public static final String NAME = "service-detail";

	@Autowired
	private I18N i18n;

	@Autowired
	private OfbizInstance ofbizInstance;

	private Grid<ServiceParameter> parametersGrid;

	// TODO: move to separate class
	@Builder
	public static class ServiceParameter {
		@Getter
		@Setter
		private String name;

		@Getter
		@Setter
		private boolean optional;

		@Getter
		@Setter
		private String type;

		@Getter
		@Setter
		private String mode;

		@Getter
		@Setter
		private boolean setInternally;

		@Getter
		@Setter
		private String entityName;

		/*
		@Getter
		@Setter
		private String fieldName;
		*/
	}

	@PostConstruct
	public void init() {
		// back button
		addHeaderComponent(
			new MButton(VaadinIcons.ARROW_BACKWARD, i18n.get("Back"), (ClickListener) event -> NavigationUtil.back())
			.withStyleName(ValoTheme.BUTTON_PRIMARY)
		);

		// field grid
		parametersGrid = new Grid<>();
		parametersGrid.setWidth("100%");
		parametersGrid.setCaption(i18n.get("Parameters"));
		parametersGrid.addColumn(ServiceParameter::getName).setCaption(i18n.get("Parameter.name"));
		parametersGrid.addColumn(ServiceParameter::isOptional).setCaption(i18n.get("Parameter.optional"));
		parametersGrid.addColumn(ServiceParameter::getType).setCaption(i18n.get("Parameter.type"));
		parametersGrid.addColumn(ServiceParameter::getMode).setCaption(i18n.get("Parameter.mode"));
		parametersGrid.addColumn(ServiceParameter::getEntityName).setCaption(i18n.get("Parameter.entityName"));
		addComponent(parametersGrid);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// validate params
		if (event.getParameters() == null || event.getParameters().isEmpty()) {
			log.error("Parameters is empty");
			NavigationUtil.back();
		}

		String serviceName = event.getParameters();
		Service service = ofbizInstance.getAllServices().get(serviceName);

		// TODO: move to separate method
		List<ServiceParameter> serviceParams = new ArrayList<>();
		for (Object attr : service.getAutoAttributesOrAttribute()) {
			if (attr instanceof Attribute) {
				ServiceParameter serviceParam = ServiceParameter.builder()
					.name(((Attribute) attr).getName())
					.optional(Boolean.valueOf(((Attribute) attr).getOptional()))
					.type(((Attribute) attr).getType())
					.mode(((Attribute) attr).getMode())
					.entityName(((Attribute) attr).getEntityName())
					.build();
				serviceParams.add(serviceParam);
			}
			else if (attr instanceof AutoAttributes) {
				String entityName = ((AutoAttributes) attr).getEntityName();
				if (entityName == null) entityName = service.getDefaultEntityName();
				log.debug("entity name: {}", entityName);

				String include = ((AutoAttributes) attr).getInclude();
				Entity entity = ofbizInstance.getAllEntities().get(entityName);
				List<Field> entityFields = OfbizUtil.getFields(entity, include);
				for (Field f : entityFields) {
					ServiceParameter serviceParam = ServiceParameter.builder()
							.name(f.getName())
							.optional(Boolean.valueOf(((AutoAttributes) attr).getOptional()))
							.mode(((AutoAttributes) attr).getMode())
							.entityName(entityName)
							.build();
					serviceParams.add(serviceParam);
				}
			}
		}



		parametersGrid.setItems(serviceParams);

		setHeaderText(serviceName);
	}
}