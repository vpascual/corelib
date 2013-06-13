
package eu.europeana.corelib.definitions.jibx;

/** 
 * A language assigned to the resource with reference to the Provider.
 Language Codes:
 bg:Bulgarian
 ca:Catalan
 cs:Czech
 da:Danish
 de:German
 el:Greek
 en:English
 es:Spanish
 et:Estonian
 fi:Finnish
 fr:French
 ga:Galician
 gd:Gaelic (Scottish)
 hu:Hungarian
 ie:Interlingue
 is:Icelandic
 it:Italian
 lt:Lithuanian
 lv:Latvian (Lettish)
 mt:Maltese
 mul:Multilingual Content
 nl:Netherlands
 no:Norway
 pl:Polish
 pt:Portugese
 ro:Romanian
 ru:Russian
 sk:Slovak
 sl:Slovenian
 sr:Serbian
 sv:Swedish
 tr:Turkish
 yi:Yiddish
 cy:Welsh
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://www.europeana.eu/schemas/edm/" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="ns:LanguageCodes" name="language"/>
 * </pre>
 */
public class Language1
{
    private LanguageCodes language;

    /** 
     * Get the 'language' element value.
     * 
     * @return value
     */
    public LanguageCodes getLanguage() {
        return language;
    }

    /** 
     * Set the 'language' element value.
     * 
     * @param language
     */
    public void setLanguage(LanguageCodes language) {
        this.language = language;
    }
}
