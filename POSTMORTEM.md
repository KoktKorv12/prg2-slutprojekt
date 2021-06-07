# Titel
Carl Berglund - 2021-06-07

# Inledning
Det program som jag skall skapa är ett spel. Spelet är att din karaktär står upp och så länge programmet körs så är det en timer som körs. När programmet stängs ner så stoppas timern och sparar tiden som du stod upp (spelets körtid). Tiden/poängen sparas sedan i en databas och visas sedan i spelet i form av en leaderboard som består av spelarens initialer samt deras tid/poäng.

Slutprojektets krav är att den ska innehålla följande delar:

- OOP
- MVC
- Databas eller nätverkskoppling

Programmet är baserad på en MySQL databas skapad i TablePlus, kodvalet är Java och programmet är skrivet i IntelliJ. 

# Bakgrund
Redovisa arbetets olika delar. Så att läsaren förstår vad du gjort och hur.
Eftersom att programmet i skrivet med OOP i tanke är arbetet uppdelat i flera olika delar som pratar med varandra. Programmets består av klasserna:

- Controller.java
- DatabaseConnection.java
- Database.java
- Game.java
- Timer.java
- User.java
- ViewModel.java
- ViewModel.form

Programmet är även designat med arkitekturmönstret Model-View-Controller (MVC) så att Model och View är separerade. 

## Databas

### Infoga bild på databas
Använd gärna bilder för att illustrera.

För att lägga till bilder i markdown. Bilderna kan du ladda upp med Git som vanligt, länka dem med url eller filnamnet.

# Positiva erfarenheter
Det som jag tyckte bra var att jag inte stötte på många problem med min kod, det var mest småproblem som gick relativt snabbt att fixa. Detta gjorde så att projektet inte tog så värst lång tid att göra. Jag tror att det beror på att jag inte riktigt utmanade mina kunskaper inom programmering, utan att jag istället gick för något säkert så att jag skulle få en "färdig" produkt inlämnat. Detta skulle jag säga är en bra grej för att jag har tidigare haft svårt att lämna in ett "färdigt" program.

# Negativa erfarenheter
Det negativa med projektet är att jag sent började på att skriva på programmet så att jag skrev det på ganska kort tid, vilket ledde till att programmet har ett fåtal buggar. Möjligheten att utveckla programmet gick jag även miste av eftersom att jag inte hade nog mycket tid till det. Min dokumentation för arbetet var också dåligt så att det är nästintill omöjligt att följa arbetets gång, även så råkade jag först commita hela arbetet till fel repository, så att commits saknas i detta repository.

# Sammanfattning
Sammanfattningsvis så är produkten klar, men inte perfekt. Produkten fungerar och gör det som den är planerad att göra, men den har ett fåtal små buggar. Det jag lärt mig från detta är att jag måste jobba från början av projektet ända tills produkten ska vara klar för att använda min tid som bäst. Men det som är positivt är att jag har lämnat in en produkt som går att köra, men produkten har utvecklingsmiljöer. Spelet är nu inte så värst intressant, det visuella är bara några knappar och en poängmätare, det som hade gjort det mer intressant hade varit sprites.
