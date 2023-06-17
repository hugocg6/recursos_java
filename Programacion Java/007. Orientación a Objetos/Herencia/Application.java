public class Application {
    public static void main(String[] args) {

        //access modifiers: public, protected, default(lack of access modifier) and private
        //public: accesible desde cualquier clase
        //protected: accesible únicamente desde subclases
        //default: accesible sólo desde la propia clase o clases del mismo paquete
        //private: accesible sólo desde la propia clase

        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand();
    }
}
