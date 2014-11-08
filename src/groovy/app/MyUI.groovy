package app

import com.app.Item
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout

class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout layout = new VerticalLayout()
        layout.setMargin(true)

        List<Item> items = Item.findAll()
        for (Item item : items) {
            String label = item.label
            layout.addComponent(new Label(label))
        }

        setContent(layout)
    }
}