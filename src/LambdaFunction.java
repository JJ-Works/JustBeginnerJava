



interface Company{
    void name(String name);
}

@FunctionalInterface
interface Corporation{
    void name(String Name);
}

@FunctionalInterface
interface Adder{
    int adds(int a, int b);
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

        // As you can see you don't need to actually specify return while returning in lambda function.
        Adder adder = (a,b) -> a + b;
        corp.name("Catherine");
        company.name("Harish");

        int result = adder.adds(2,3);

        System.out.println("\n\nFinal Result = " + result);

    }
}
