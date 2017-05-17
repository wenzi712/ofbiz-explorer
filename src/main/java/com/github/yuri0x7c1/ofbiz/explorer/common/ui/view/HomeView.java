package com.github.yuri0x7c1.ofbiz.explorer.common.ui.view;

import org.vaadin.spring.sidebar.annotation.FontAwesomeIcon;
import org.vaadin.spring.sidebar.annotation.SideBarItem;

import com.github.yuri0x7c1.ofbiz.explorer.common.ui.sidebar.Sections;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;


@SpringView(name = "")
@SideBarItem(sectionId = Sections.VIEWS, caption = "Home", order = 0)
@FontAwesomeIcon(FontAwesome.HOME)
public class HomeView extends VerticalLayout implements View {

    public HomeView() {
        setSpacing(true);
        setMargin(true);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
