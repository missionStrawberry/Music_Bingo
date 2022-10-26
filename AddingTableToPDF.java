// Adding table in a pdf using java
import java.util.ArrayList;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.parser.listener.TextChunk;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;


public class AddingTableToPDF {
	public static void main(String args[]) throws Exception
	{
		
		ArrayList<String> num = new ArrayList<String>();
		ArrayList<String> usedNums = new ArrayList<String>();
		
		// fill up num array
		num.add("Uptown Funk!");
		num.add("Party Rock Anthem");
		num.add("Shape Of You");
		num.add("Closer");
		num.add("Girls Like You");
		num.add("We Found Love");
		num.add("Old Town Road");
		num.add("Somebody That I Used To Know");
		num.add("Despacito");
		num.add("Rolling In The Deep");
		num.add("Sunflower");
		num.add("Without Me");
		num.add("Call Me Maybe");
		num.add("Blurred Lines");
		num.add("Perfect");
		num.add("Sicko Mode");
		num.add("All About That Base");
		num.add("Royals");
		num.add("God's Plan");
		num.add("Moves Like Jagger");
		num.add("Happy");
		num.add("Just The Way You Are");
		num.add("Rockstar");
		num.add("TiK ToK");
		num.add("See You Again");
		num.add("Dark Horse");
		num.add("Thrift Shop");
		num.add("One More Night");
		num.add("We Are Young");
		num.add("That's What I Like");
		num.add("The Hills");
		num.add("All of Me");
		num.add("Happier");
		num.add("Shake It Off");
		num.add("One Dance");
		num.add("Radioactive");
		num.add("Sexy And I Know It");
		num.add("Someone Like You");
		num.add("Counting Stars");
		num.add("E.T.");
		num.add("Trap Queen");
		num.add("Love Yourself");
		num.add("Firework");
		num.add("Give Me Everything");
		num.add("Locked Out Of Heaven");
		num.add("Love The Way You Lie");
		num.add("Thinking Out Loud");
		num.add("Sorry");
		num.add("California Gurls");
		num.add("Dynamite");
		num.add("Lucid Dreams");
		num.add("Hello");
		num.add("Work");
		num.add("Grenade");
		num.add("Hey, Soul Sister");
		num.add("I Like It");
		num.add("Wake Me Up!");
		num.add("Don't Let Me Down");
		num.add("Havana");
		num.add("OMG");


		
		String file
			= "C:/Users/amlov/Documents/musicBingoCards.pdf";
		// Step-1 Creating a PdfDocument object
		PdfDocument pdfDoc
			= new PdfDocument(new PdfWriter(file));

		// Step-2 Creating a Document object
		Document doc = new Document(pdfDoc);

		for (int i = 0; i < 180; i++ ) {
			
			// Step-3 Creating a table
			Table table = new Table(5);
			table.setMargin(30F);
			table.setTextAlignment(TextAlignment.CENTER);
			table.setMaxWidth(400F);
			table.setMinWidth(100F);
			table.setMaxHeight(800F);
			table.setMinHeight(300F);

			// Step-4 Adding cells to the table
			
			for (int r = 0; r < 5; r++) {
				for (int c = 0; c < 5; c++) {
					if (r == 2 && c == 2) {
						table.addCell("FREE");
					} else {
						int temp = (int)(Math.random() * (num.size()));
						String t = num.remove(temp);
						usedNums.add(t);
						table.addCell(t);
					} // else
				} // for
			} // for
			while (!usedNums.isEmpty()) {
				num.add(usedNums.remove(0));
			} // while

			// Step-6 Adding Table to document
			doc.add(table);

		}
		

		// Step-7 Closing the document
		doc.close();
		System.out.println("Table created successfully..");
	}
}
