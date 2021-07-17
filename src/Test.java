public class Test {
    private int i;
    private String g;

    public Test(int i, String g) {
        this.i = i;
        this.g = g;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Test) {
            Test another = (Test) obj;
            if (this.i == another.i && this.g.equals(another.g)) return true;
        }
        return false;
    }
}
