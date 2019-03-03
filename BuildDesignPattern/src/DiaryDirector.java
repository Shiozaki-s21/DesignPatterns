public class DiaryDirector {
    private DocumentBuilder builder;

    public DiaryDirector(DocumentBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.setTitile("Go to Workshop for Design pattern");
        builder.setHeader("2019 03 02");
        builder.setBody("Today I study about Builder and Adapter design pattern...");
        builder.setFooter("I will review it soon");
        builder.getResult();
    }
}
