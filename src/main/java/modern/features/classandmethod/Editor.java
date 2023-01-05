package modern.features.classandmethod;

public class Editor {


    public void execute(){
        botonEvent(new Event() {
            @Override
            public void event(Target action) {
                System.out.println("Contenido es: "+action.getContent());
            }
        });
    }

    private void botonEvent(Event event){
        Target target = new Target("este contenido esta en espanol");
        System.out.println("this a new target: "+target);
        event.event(target);
    }

}