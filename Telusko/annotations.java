//   Java provides several built-in annotations, such as @Deprecated, @Override, and @SuppressWarnings
//   @Deprecated  --> this means that the current version will no longer be available in the future. It is
//   present now but will be removed in future.
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
