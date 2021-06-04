public class ServerNameGenerator {
    private static String[] adj = {"adorable", " adventurous", "aggressive", "agreeable", "alert", " alive", "amused", "angry", " annoyed", " annoying"};
    private static String[] noun = {"octopus", "squirrel", "dog", "cat", "crocodile", "cassowary", "elephant", "rhino", "lion", " tiger", " bear"};

    private static String randomEle(String[] strings){
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String serverName (String[] arr1, String[] arr2){
        String adj = randomEle(arr1);
        String noun = randomEle(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Your server name is :");
        System.out.println(serverName(adj,noun));
    }
}
