
import java.awt.Desktop;
import java.net.URI;
class BrowseURL
{
public static void main(String args[]) throws Exception
{

// Create Desktop object
Desktop d=Desktop.getDesktop();

// Browse a URL, say google.com
d.browse(new URI("http://google.com"));

}
}
