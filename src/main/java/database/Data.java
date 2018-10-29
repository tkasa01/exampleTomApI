
 package main.java.database;/*


public class Data {
    private Person seller1 = new Person();
    //private Offers product1 = new Offers();

    public void writeFile() {
        try {
            FileWriter fileWriter = new FileWriter("/Users/tkasa/IdeaProjects/rest-java/src/main/java/com/offersprogect/localDB/collection.txt");
            PrintWriter pw = new PrintWriter(fileWriter);
            Scanner sc = new Scanner(System.in);
            System.out.println("Declare your name" + sc.hasNext());

            pw.println(seller1.toString());
            pw.println("Product: " + product1.toString());

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFile() {
        String str = "";
        try {
            FileReader fr = new FileReader("/Users/tkasa/IdeaProjects/rest-java/src/main/java/com/offersprogect/localDB/collection.txt");
            BufferedReader br = new BufferedReader(fr);

            while ((str = br.readLine()) != null) {
                System.out.println(str + "\n");

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
*/