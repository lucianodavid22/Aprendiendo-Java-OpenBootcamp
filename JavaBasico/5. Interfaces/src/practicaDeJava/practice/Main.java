package practicaDeJava.practice;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }

    public interface CocheCRUD {
        void save();
        void findAll();
        void delete();
    }

    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {
            System.out.println("save");
        }

        @Override
        public void findAll() {
            System.out.println("findAll");
        }

        @Override
        public void delete() {
            System.out.println("delete");
        }
    }
}
