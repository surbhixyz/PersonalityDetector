import java.util.Scanner;
public class Exceptionhandling {

    // Method for the user to input their choices 

    static Scanner sc=new Scanner(System.in);
    public static char[] UserInput(String [] arr){          
        char [] OptionsArr= new char[arr.length];
        for(int i=0;i<arr.length;){
            System.out.println(arr[i]);
            boolean flag=true;
            while (flag){
                try {
                    System.out.println("Enter A or B:");
                    OptionsArr[i]=sc.nextLine().charAt(0);
                    if(OptionsArr[i]=='A' || OptionsArr[i]=='a' ||OptionsArr[i]=='B'|| OptionsArr[i]=='b'){
                        flag=false;
                        break;
                        
                    }
                else{throw new IllegalArgumentException("Wrong choice; choose A or B");}

            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
                
            }
            }
            
            } // Returns a char array of user input choices 
        return OptionsArr;
    }


    // Method to calculate the numer of times A and B was choosen by the user
    public static int[] calculate(char[] x){               
        int A=0;
        int B=0;
        int [] NumberArr= new int[2];
        for (int i=0;i<x.length;i++){
            if (x[i]=='A' || x[i]=='a'){
                A=A+1; }
        
            else if (x[i]=='B' || x[i]=='b'){
                B=B+1;}

            else{
                continue;}
            }
        NumberArr[0]=A;
        NumberArr[1]=B;
        return NumberArr;  // Returns a array of size 2, where index 0 stores number of A's and index 1 stores number of B's
    }


    // Main method 
    public static void main(String[] args) {                                

        
        // Options for Intorvertism vs Extrovertism stored in a string array

        String[] extroversionVsIntroversion = {
            "A. Express yourself well verbally B. Express yourself well in writing",
            "A.Gain energy from socializing and being out and about B. Gain energy through inner reflection and solitude. ",
            "A. seek many tasks, public activities, interaction with others. B. seek private solitary activities with quiet to concentrate",
            "A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one",
            "A. Think as you speak  B. Think first and talk later"};


        // Options for Sensing vs Intuition stored in a string array

        String[] sensingVsIntuition = {
            "A. Quickly notice the change in somebody's behavior or acts. B. Not very good at observing changes.",
            "A. imaginative, innovative, theoretical  B. practical, realistic, experiential",
            "A. focus on here-and-now B. Take enjoyment in building far plans, focus big picture ",
            "A. Often feel distracted  B. Everything is accurate and clear for you",
            "A. look for meaning and possibilities B. interpret literally "};


        // Options for Thinking vs Feeling stored in a string array

        String[] thinkingVsFeeling = {
            "The best way to persuade you is: A great logical explanation  B. Strong emotional appeal ",
            "A. Candid, straight forward, frank. B.Tactful, kind, empathetic",
            "A. Firm, tend to criticize, Task-oriented. B. Gentle, tend to appreciate, conciliate",
            "A. Tough-minded, just B.Tender-hearted, merciful",
            "A. Issue-oriented B. People-oriented"};


        // Options for Judging  vs Perceiving stored in a string array

        String[] judgingVsPerceiving= {
            "Biggest fear: A. Not being successful financially B. Being alone without family or friends",
            "A. Dislike surprises B  Like surprises",
            "A. regulated, structured,organized B. easygoing, flexible,spontaneous",
            "A. Like spoilers B. Dislike spoilers",
            "A. control, govern B. latitude, freedom"};

            try{

            System.out.println("Welcome to my personality detection program! ");
            Thread.sleep(3000);
            System.out.println("As we know a person's personality is broadly classified into 16 Categories.");
            Thread.sleep(4000);
            System.out.println("This quiz will help you identify your personality type.");
            Thread.sleep(4000);
            System.out.println("Instructions: ");
            Thread.sleep(2000);
            System.out.println("20 questions from 5 categories will be asked, choose the option which suits you the best.");
            Thread.sleep(5000);
            System.out.println("LET US BEGIN");
            Thread.sleep(3000);

            }

            catch(InterruptedException e){
                System.err.format("IOException: %s%n", e);

            }
           // using calculate and UserInput methods

            char[] extroversionVsIntroversionStorage=UserInput(extroversionVsIntroversion);
            int [] EI=calculate(extroversionVsIntroversionStorage);
            

            char[] sensingVsIntuitionStorage=UserInput(sensingVsIntuition);
            int [] SI=calculate(sensingVsIntuitionStorage);
            
            
            char[] thinkingVsFeelingStorage=UserInput(thinkingVsFeeling);
            int [] TF=calculate(thinkingVsFeelingStorage);
            

            char[] judgingVsPerceivingStorage=UserInput(judgingVsPerceiving);
            int [] JP=calculate(judgingVsPerceivingStorage);


            System.out.println();
            System.out.println();
            try{

            System.out.println("Processing your results, please wait");
            Thread.sleep(7000);
            System.out.println("According to the mbti calculations you are:");
            Thread.sleep(2000);
            System.out.println();
            System.out.println((EI[0]/5.0)*100+"% an Extrovert");
            System.out.println();
            System.out.println((EI[1]/5.0)*100+"% an Intovert");
            System.out.println();
            System.out.println((SI[0]/5.0)*100+"% an Intuitive");
            System.out.println();
            System.out.println((SI[1]/5.0)*100+"% a Sensor");
            System.out.println();
            System.out.println((TF[0]/5.0)*100+"% a Thinker");
            System.out.println();
            System.out.println((TF[1]/5.0)*100+"% a Feeler");
            System.out.println();
            System.out.println((JP[0]/5.0)*100+"% Judgy");
            System.out.println();
            System.out.println((JP[1]/5.0)*100+"% Perceiving");
            System.out.println();
            Thread.sleep(10000);
            
            System.out.print("This implies that your mbti personality type is: ");
            Thread.sleep(3000);

            if (EI[0]>3){
                System.out.print("E");
            }
            else{
                System.out.print("I");
            }


            if (SI[0]>3){
                System.out.print("S");
            }
            else{
                System.out.print("N");
            }

            if (TF[0]>3){
                System.out.print("T");
            }
            else{
                System.out.print("F");

            }

            if (JP[0]>3){
                System.out.println("J");
            }
            else{
                System.out.println("P");

            }

            Thread.sleep(3000);
            System.out.println();
            System.out.println("Kindly refer to the following explanation: ");
            System.out.println();
            Thread.sleep(3000);
            System.out.println("I-Introvertism E- Extrovertism");
            System.out.println("S-Sensing N-Intuition");
            System.out.println("T-Thinking F-Feeling");
            System.out.println("J-Judging P-Percieving");
            Thread.sleep(3000);

         } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            
        System.out.println();
        System.out.println();
        System.out.print("For your personality interpretation, please visit : ");
        System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");

        System.out.println();
        System.out.println();

        System.out.println("--------------------------------------------------------------Thank you---------------------------------------------------------------------- ");
    

        }
    }
