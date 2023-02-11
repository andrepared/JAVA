package relational;

public class PracticingSwitch {
    public static void main(String args[])
    {

       String option = "Save";

switch (option)
{
    case "Save":
        System.out.println("This is the save option");
            break;
    case "New":
        System.out.println("This is the new option");
            break;
    case "Save As":
        System.out.println("This is the save as option");
            break;
    case "Close":
        System.out.println("This is the close option");
            break;
        default:
            System.out.println("This is not an option")
}

    }

}
