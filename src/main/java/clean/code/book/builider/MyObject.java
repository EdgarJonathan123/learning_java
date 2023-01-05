package clean.code.book.builider;

public final class MyObject {
    private String property1;
    private String property2;


    //public String getProperty1() {
    //    return property1;
    //}

    //public String getProperty1() {
    //    return property2;
    //}

    public static class Builder {
        private MyObject obj;

        private MyObject getObject() {  //Lazy loading
            if(obj==null) {
                obj = new MyObject();
            }
            return obj;
        }

        public Builder setProperty1(String property1) {
            //validar property1
            MyObject obj = getObject();
            obj.property1 = property1;
            return this;  //patrón fluent
        }

        public Builder setProperty2(String property2) {
            //validar property2
            MyObject obj = getObject();
            obj.property2 = property2;
            return this;   //patrón fluent
        }

        public Builder loadFromAnotherObject(MyObject2 object2) {
            MyObject obj = getObject();
            obj.property1 = object2.getProperty1();
            obj.property2 = object2.getProperty2();
            return this;    //patrón fluent
        }

        private void validate(MyObject obj) {
           // MyObject obj = getObject();
            //validar que el objeto tenga todas las propiedades requeridas o que dispare una excepción
        }

        public MyObject build() {
            validate(obj);
            return obj;
        }

    }
}



