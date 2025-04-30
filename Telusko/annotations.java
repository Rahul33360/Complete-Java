//   Java provides several built-in annotations, such as @Deprecated, @Override, and @SuppressWarnings

class Anno {
    public void showingTheOutputInScreenWithText() {
        System.out.println("in Anno Show");
    }
}
class Bnno extends Anno {
    @Override          //   this words called as "annotations" .
    public void showingTheOutputInScreenWithText() {
        System.out.println("in Bnno Show");
    }
}

public class annotations {
    public static void main(String[] args) {
        Anno obj = new Bnno();
        obj.showingTheOutputInScreenWithText();

    }
}
