package com.example.paintart.Models;

import com.example.paintart.R;

public class Artists {
    public static Artist[] getArtist() {
        return ARTISTS;
    }


    public static final Artist ARTIST_ONE = new Artist("Michelangelo di Lodovico", R.drawable.michelangelo, "6 March 1475 – 18 February 1564), known best " +
                     "as simply Michelangelo (English: /ˌmaɪkəlˈændʒəloʊ, ˌmɪk-/), was an " +
                     "Italian sculptor, painter, architect and poet of the High Renaissance born in the Republic of Florence, " +
                     "who exerted an unparalleled influence on the development of Western art. ","https://www.britannica.com/biography/Michelangelo");

    public static final Artist ARTIST_TWO = new Artist("Vincent Willem van Gogh", R.drawable.vincent_van,
            "Vincent Willem van Gogh (Dutch: [ˈvɪnsɛnt ˈʋɪləm vɑŋ ˈɣɔx] (About this soundlisten);[note 1] 30 March 1853 – 29 July 1890) " +
                    "was a Dutch post-impressionist painter who is among the most famous and influential figures in the history" +
                    " of Western art. In just over a decade he created about 2,100 artworks, " +
                    "including around 860 oil paintings, most of which date from the last two years of his life. ","https://www.geni.com/people/Vincent-Willem-van-Gogh-Jr/6000000009786706806");

    public static final Artist ARTIST_THREE = new Artist("Pablo Picasso", R.drawable.picasso,
            "Pablo Ruiz Picasso (UK: /ˈpæbloʊ pɪˈkæsoʊ/, US: /ˈpɑːbloʊ pɪˈkɑːsoʊ, -ˈkæs-/, Spanish: [ˈpaβlo piˈkaso]; 25 October 1881 – 8 April 1973)" +
                    " was a Spanish painter, sculptor, printmaker, ceramicist, stage designer, " +
                    "poet and playwright who spent most of his adult life in France. Regarded as one of the most influential artists of the " +
                    "20th century, he is known for co-founding the Cubist movement, the invention of constructed sculpture, the " +
                    "co-invention of collage, and for the wide variety of styles that he helped develop and explore.","https://www.britannica.com/biography/Pablo-Picasso");

    public static final Artist ARTIST_FOUR = new Artist("Francisco Goya", R.drawable.francisco_goya,
            "Francisco José de Goya y Lucientes (/ˈɡɔɪə/; Spanish: [fɾanˈθisko xoˈse ðe ˈɣoʝa i luˈθjentes]; " +
                    "30 March 1746 – 16 April 1828) was a Spanish romantic painter and printmaker." +
                    " He is considered the most important Spanish artist of the late 18th and " +
                    "early 19th centuries and throughout his long career was a commentator and chronicler of his era.","https://www.theartstory.org/artist/goya-francisco/");

    public static final Artist ARTIST_FIVE = new Artist("Rembrandt Harmenszoon van Rijn", R.drawable.rembrandt_rijn,
            "Rembrandt Harmenszoon van Rijn (/ˈrɛmbrænt/, also US: /-brɑːnt/, Dutch: [ˈrɛmbrɑnt ˈɦɑrmə(n)soːn vɑn ˈrɛin] " +
                    "(About this soundlisten); 15 July 1606 – 4 October 1669) was a Dutch draughtsman, painter, and printmaker. " +
                    "An innovative and prolific master in three media, he is generally considered one of the greatest visual artists in the history of art and the most important " +
                    "in Dutch art history. Unlike most Dutch masters of the 17th century, Rembrandt's works depict a wide range of style and subject matter, from portraits and " +
                    "self-portraits to landscapes, genre scenes, allegorical and historical scenes, and biblical and mythological themes as well as animal studies. ","https://www.britannica.com/biography/Rembrandt-van-Rijn");

    public static final Artist ARTIST_SIX = new Artist("Auguste Rodin", R.drawable.rodin_cropped,
            "François Auguste René Rodin (12 November 1840 – 17 November 1917) was a French sculptor. Although Rodin is generally considered the progenitor of modern sculpture," +
                    " he did not set out to rebel against the past. He was schooled traditionally, took a craftsman-like approach to his work, " +
                    "and desired academic recognition, although he was never accepted into Paris's foremost school of art. ","https://www.britannica.com/biography/Auguste-Rodin");

    public static final Artist ARTIST_SEVEN = new Artist("Gustav Klimt", R.drawable.klimt,
            "Gustav Klimt (July 14, 1862 – February 6, 1918) was an Austrian symbolist painter and one of the most prominent members of " +
                    "the Vienna Secession movement. Klimt is noted for his paintings, murals, sketches, and other objets d'art. " +
                    "Klimt's primary subject was the female body, and his works are marked by a frank eroticism.","https://www.gustav-klimt.com/");

    public static final Artist ARTIST_EIGHT = new Artist("Frédéric Auguste Bartholdi", R.drawable.frederic_auguste_bartholdi,
            "Bartholdi was born in Colmar, France, 2 August 1834. He was born to a family of German Protestant (Alsatian) heritage, with his family name romanticized from Barthold." +
                    " His parents were Jean Charles Bartholdi (1791–1836) and Augusta Charlotte Bartholdi (née Beysser; 1801–1891). " +
                    "Frédéric Auguste Bartholdi was the youngest of their four children, and one of only two to survive" +
                    " infancy, along with the oldest brother, Jean-Charles, who became a lawyer and editor.","https://www.britannica.com/biography/Frederic-Auguste-Bartholdi");

    public static final Artist ARTIST_NINE = new Artist("Gutzon Borglum", R.drawable.gutzon_borglum,
            "The son of Danish immigrants, Gutzon Borglum was born in 1867 in St. Charles in what was then Idaho Territory. Borglum was a child of Mormon polygamy. " +
                    "His father, Jens Møller Haugaard Børglum (1839–1909), " +
                    "had two wives when he lived in Idaho: Gutzon's mother, Christina Mikkelsen Borglum (1847–1871) and Gutzon's mother's sister Ida, who was Jens's first wife. Jens Borglum" +
                    " decided to leave Mormonism and moved to Omaha, Nebraska where polygamy was both illegal and taboo.","https://www.britannica.com/biography/Gutzon-Borglum");

    public static final Artist ARTIST_TEN = new Artist("Leonardo da Vinci", R.drawable.leonardo,
            "Leonardo di ser Piero da Vinci (Italian: [leoˈnardo di ˌsɛr ˈpjɛːro da (v)ˈvintʃi] (About this soundlisten); 14/15 April 1452 – 2 May 1519)," +
                    " known as Leonardo da Vinci (English: /ˌliːəˈnɑːrdoʊ də ˈvɪntʃi, ˌliːoʊˈ-, ˌleɪoʊˈ-/ LEE-ə-NAR-doh də VIN-chee, LEE-oh-, LAY-oh-),[4] was an Italian polymath " +
                    "of the Renaissance whose areas of interest included invention, drawing, painting, sculpture, architecture, science, music, mathematics, " +
                    "engineering, literature, anatomy, geology, astronomy, botany, paleontology, and cartography.","https://www.britannica.com/biography/Leonardo-da-Vinci");

    public static final Artist[] ARTISTS = {ARTIST_ONE, ARTIST_TWO, ARTIST_THREE, ARTIST_FOUR, ARTIST_FIVE, ARTIST_SIX, ARTIST_SEVEN, ARTIST_EIGHT, ARTIST_NINE, ARTIST_TEN};
}

