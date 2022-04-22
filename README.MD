# Editor MP3 tagů

## Požadavky

### Funkční a technické požadavky na aplikaci

1. Menu, které umožní opakovaný výběr funkcí aplikácie a ukončení aplikace
2. Přehledný výpis výsledků na konzoli - použijte alespoň jednou String.format() a StringBuilder
3. Načítání vstupních dat z minimálně dvou souborů
   * Vstupní data jsou samotné mp3 soubory
4. Zápis výstupních dat do souboru
   * Výpis informací do txt souboru, popřípadě generace m3u souboru
5. Možnosť práce s textovými a binárními soubory (alespoň někde)
   * mp3, txt, (m3u), ...
6. Ideálně využití reálných otevřených dat
7. Adresář data se všemi datovými soubory a případně třídu Datastore se statickými metodami, které budou poskytovat další statická data.
8. Tri balíčky:
   1. `ui` – třídy, tvořící uživatelské rozhraní - komunikaci s uživatelem
   2. `app` – třídy, tvořící logiku s daty aplikácie - modely, kontrolery
   3. `utils` – pomocné třídy např. vlastní výjimky, vlastní rozhraní
9. Programování vůči rozhraní a použití vlastního rozhraní
   * Při použití rozhraní např. "TagEditable" by se pak mohla přidat podpora pro další formáty (wav/flac/m4a/...)
10. Použití java.time API pro práci s časem
    * Neměl by být problém, čas se používá u délky skladby
11. Použít enum typ
    * ???
12. Použití kontejnerové třídy jazyka Java (ArrayList, LinkedList, HashMap ...) z Collections frameworku.
    * např. třída Playlist s kolekcí objektů typu AudioFile
13. Alespoň dvě možnosti třídění s využitím rozhraní Comparable a Comparator
    * Sortování AudioFiles v Playlist podle různých parametrů
14. Použití regulárního výrazu
    * např. pro filtrování souborů v playlistu
15. Ošetření vstupů, aby chybné vstupy nezpůsobily pád programu - pomocí existujících a vlastních výjimek
16. Vhodné ošetření povinně ošetřovaných výjimek
17. Použití Vámi vybrané externí knihovny (audio, posílání emailů, práce s obrázkem, junit testování, jiné formáty uložení dat ...)
18. Javadoc - každá třída a metoda musí mít javadoc popis, abyste mohli na závěr vygenerovat javadoc dokumentaci.

### Dokumentace

Dokumentace obsahuje zjednodušené fáze analýzy, designu a přípravy na testování, které sa píšou před samotným kódováním. Dokumentaci vytvořte jako README ve Vašem GitHub projektu.

* Zadání práce
  * Problém (motivace)
  * Navrhované řešení
* Návrh řešení
  * Funkční specifikace – seznam funkcí z pohledu uživatele, které bude Váš program poskytovat např. formou větveného seznamu (stromu). Může sloužit následně jako podklad pro menu.
  * Popis struktury vstupních a výstupních souborů – jaké datové typy bude obsahovat, čím budou odděleny jednotlivé údaje, jestli je požadovaný určitý formát názvů souborů a pod.
  * Class diagram - pomocí nějakého nástroje např. diagram.net
* Příprava na testování. Vytvořte testovací soubory. Vstupní soubory naplňte testovacími daty v minimálním rozsahu 20 (řádků). Napište sadu 10 testů - při zadaných konkrétních vstupech uživatele, jaké jsou očekávané konzolové výstupy. Sada by měla obsahovat testy funkcionality programu pro běžné i limitní stavy jako i testy ošetření vstupů.
* Popis fungování externí knihovny.

### Zdrojový kód

* Snažte se dodržet a využít principy objektového programování.
* Důraz klaďte na funkčnost a přehlednost kódu. KISS - Keep It Simple and Smart.
* Používejte smysluplné názvy proměnných (nemusíte ich pak komentovat).
* Vymažte z programu nepotřebný kód (alternativní řešení) kromě testovacích main metod.

### Prezentace

* V zápočtovém týdnu předvedete Vaší aplikaci a spolužáci Vám ji otestují.  
* Připravte si slidy, kde představíte
  * zadání
  * objektový návrh - rozdělení do tříd (zjednodušený class diagram)
  * způsob použití externí neprobírané  knihovny.