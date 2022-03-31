package einsendaufgabe.eins;

import java.time.LocalDateTime;

/**
 * Datencontainer fuer Metainformationen ueber eine Datei bzw. ein Verzeichnis
 * @author Holger Hinrichs
 */
public class DateiInfos {
	
	/**
	 * Absoluter Pfad zum Element (Datei oder Verzeichnis)
	 */
	public String absoluterPfad;
	
	/**
	 * Gibt an, ob das Element bereits existiert 
	 */
	public boolean existiert;
	
	/**
	 * Datum der letzten Aenderung
	 */
	public LocalDateTime letzteAenderung;
	
	/**
	 * Groesse in Bytes
	 */
	public long groesse;
	
	/**
	 * Gibt an, ob das angegebene Element eine Datei (true) oder ein Verzeichnis (false) ist
	 */
	public boolean istDatei;
	
	/**
	 * Gibt an, ob der aktuelle User Leserechte fuer dieses Element besitzt
	 */
	public boolean lesezugriff;
	
	/**
	 * Gibt an, ob der aktuelle User Schreibrechte fuer dieses Element besitzt
	 */
	public boolean schreibzugriff;


	/**
	 * Gibt einen String mit allen Informationen zurueck. 
	 * 
	 * @return Eine Zeichenkette mit allen Informationen zur Ausgabe auf der Konsole. 
	 */
	@Override
	public String toString() {
		if (!this.existiert) 
			return "Diese Datei / dieses Verzeichnis existiert nicht.";

		return String.format(
			"Es ist eine Datei: %s%n" +
			"Absoluter Pfad: %s%n" +
			"Zuletzt geaendert am: %s%n" +
			"Groesse: %d Bytes%n" +
			"Lesezugriff: %s%n" +
			"Schreibzugriff: %s%n",
			this.istDatei, 
			(this.absoluterPfad != null) ? this.absoluterPfad : "-", 
			(this.letzteAenderung != null) ? this.letzteAenderung : "-", 
			this.groesse, 
			this.lesezugriff, 
			this.schreibzugriff
		);
	}

}