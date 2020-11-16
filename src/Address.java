public class Address<T> {

    private Object city;
    private Object street;
    private int number;

    public Address(Object city, Object street, int number){
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public T getCity() {
        return (T) city;
    }

    public T getStreet(){
        return (T) street;
    }

    public int getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", street=" + street +
                ", number=" + number +
                '}';
    }
}
