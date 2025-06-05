interface Company{
    void name(String name);
}

interface Corporation{
    void name(String Name);
}

public class LambdaFunction {
    public static void main(String[] args) {

        //Using anonymous class.
        Company company = new Company() {
            @Override
            public void name(String name) {
                System.out.printf("Hello! I am %s and I'm new in this company.",name);
            }
        };

        // using lambda function you can remove the small brackets if you have one parameter, the curly braces if only one line of code.
        Corporation corp = (Name) ->
        {
            System.out.printf("Hello! Im %s and I'm new in This Corporation\n", Name);
        };

        corp.name("Surendra");
        company.name("Harish");
    }
}
