// Enums (enumeration) is a datatype because it is used as a datatypes during declaration and enum is also a final class meaning the constant declared
// inside is enum is final and static object used to define the collection of datatypes.


// Annotation are the metadata that provides extra information to the compiler or runtime about the code, but they do not directly affect the code.


enum Days{
    SUNDAY, monday, tuesday, wednesday, thursday, friday, saturday
}

public class Enums {
    public static void main(String[] args) {
        Days days = Days.SUNDAY;

        switch (days)
        {
            case SUNDAY:
                System.out.println("Hello");
                break;

            default:
                System.out.println("default");
                break;


        }
    }
}
