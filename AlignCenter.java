public class AlignCenter implements AlignStrategy {
     static  int TEXT_MAX_LENGTH = 10000;
     public  void render(Paragraph p, String context)
    {
        int freeSpace = (TEXT_MAX_LENGTH - p.getText().length()) / 2;

        String before = "";
        String after = "";
        for (int i = 0; i < freeSpace; i++)
        { before += " "; }
        freeSpace = TEXT_MAX_LENGTH - p.getText().length() - freeSpace;
        for (int i = 0; i < freeSpace; i++)
        { after += " "; }
        p.setText(before + p.getText() + after);
    }
}