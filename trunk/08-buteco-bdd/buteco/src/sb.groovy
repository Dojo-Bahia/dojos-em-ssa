import groovy.beans.Bindable
import groovy.swing.SwingBuilder

class MyModel {
   @Bindable int count = 0
}

def model = new MyModel()
new SwingBuilder().edt {
  frame(title: "Java Frame", size: [200, 200], locationRelativeTo: null, show: true) {
    gridLayout(cols: 1, rows: 2)
    label(text: bind(source: model, sourceProperty: "count", converter: { v ->  v? "Clicked $v times": ''}))
    button("Click me!", actionPerformed: { model.count++ })
  }
}
