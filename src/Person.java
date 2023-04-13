public class Person {
    private int id;
    private String name;
    private int age;
    static int numeroPersone=0;
    public static String conversion="5";
    public static int number=0;
    public Integer numero_oggetto=0;

    public Person (int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        numeroPersone++;
    }
    public static int incremento(){
        number=Integer.parseInt(conversion);
        number++;
        return number;
    }

    public int getNumber() {
        return Person.incremento();

    }


    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    public Integer StringaIntero(){
      numero_oggetto=  Integer.valueOf(conversion);
      return numero_oggetto;
    }

   /* public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }*/

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }


}
