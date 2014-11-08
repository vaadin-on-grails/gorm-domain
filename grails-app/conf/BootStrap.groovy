import com.app.Item

class BootStrap {

    def init = { servletContext ->
        new Item(label: 'First').save()
        new Item(label: 'Second').save()
        new Item(label: 'Third').save()
        new Item(label: 'Fourth').save()
    }
    def destroy = {
    }
}
