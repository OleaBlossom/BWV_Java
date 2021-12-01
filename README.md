# BWV_Java

Geben die Java-Quelltexte auf Moodle ab.
1.	Recherchieren Sie die Symbolik eines Klassendiagramms. Erstellen und testen Sie anschließend folgende Klasse MitarbeiterPackage.Mitarbeiter:

MitarbeiterPackage.Mitarbeiter
id (int)
name (String)
getter and setter for each property
toString


2.	Erstellen Sie die abgebildeten Klassen Kreis und Rechteck vollständig mit allen(!) set und get Methoden, auch wenn sie nicht abgebildet sind. Kapselung: Überlegen Sie, welche Werte für die Instanzvariablen nicht zulässig sind und schützen Sie diese vor falschen Werten.
Testen Sie beide Klassen in einer Klasse TestFiguren, welche die main-Methode enthält. 

Rechteck
- laenge (double)
- breite (double)
+ umfang(): double
+ flaeche(): double

Für die Klasse Kreis können Sie Math.PI verwenden. 
Kreis
- radius (double)
+ umfang(): double
+ flaeche(): double
 
3.	Erstellen Sie die vollständige Klasse Punkt. Sie soll für ein Koordinatensystem geschrieben werden, welches von -100 bis +100 geht. Die abgebildete Methode verschiebt den Punkt im Koordinatensystem. 
Kapselung: Achten Sie bei allen Methoden darauf, dass der Punkt im Koordinatensystem bleibt.
 
 Punkt
 - x (double)
 - y (double)
 + verschiebe(plusX: double, plusY: double)
 
4.	Erstellen Sie eine Klasse die in der Lage ist, Zahlen von einem Zahlensystem (Dual-, Oktal-, Decimal- oder Hexadezimalsystem) in ein anderes umzuwandeln. Erstellen Sie ein Klassendiagramm und diskutieren Sie es in Ihrer Gruppe. Programmieren Sie anschließend die Klasse.
5.	Erstellen Sie die vollständige Klasse Datum. Die Methode alsTage soll das Datum in Tage (gerechnet von Christi Geburt an) umrechnen. Recherchieren sie die Schaltjahrregelung für die Methoden alsTage() und istSchaltjahr(). Die Hilfsmethode monatsTage() gibt die maximale Anzahl der Tage im aktuellen Monat zurück und wird in setTage() verwendet. Die Hilfsmethode monatToString konvertiert den Monat in einen Text. Das erste Jahr ist das Jahr 1, da damals die 0 noch nicht "erfunden" war.

Datum
- tag (int)
- monat (int)
- jahr (int)
+ anzeigeFormat()
+ alsTage(): int
+ liegtImSchaltjahr(): boolean
- monatToString(): String
- monatsTage(): int


Kontrollangaben jeweils Datum mit alsTage und Schaltjahr:
1. Januar 0001
1
1. Januar 1970
719163
29. November 1967
718399
15. Februar 2000
730165
2000 ist Schaltjahr
1. Januar 1900
693596
15. Februar 2012
734548
2012 ist Schaltjahr


