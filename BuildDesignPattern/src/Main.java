

public class Main {
    public static void main(String[] args) {
        // create report as a HTML
        ReportDirector reportDirectorHTML = new ReportDirector(new HtmlBuilder());

        // create report as a MarkDown
        ReportDirector reportDirectorMD = new ReportDirector(new MarkDownBuilder());

        // print out
        reportDirectorHTML.build();
        reportDirectorMD.build();

        // create diary as a HTML
        DiaryDirector diaryDirectorHTML = new DiaryDirector(new HtmlBuilder());

        // create diary as a MarkDown
        DiaryDirector diaryDirectorMD = new DiaryDirector(new MarkDownBuilder());

        // print out
        diaryDirectorHTML.build();
        diaryDirectorMD.build();
    }
}
