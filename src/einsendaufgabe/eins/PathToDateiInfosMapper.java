package einsendaufgabe.eins;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class PathToDateiInfosMapper implements IMapper<String, DateiInfos> {
    @Override
    public String toKey(DateiInfos value) { //YAGMI-prinzip ;)
        return null;
    }

    @Override
    public DateiInfos toValue(String pfad) {
        Path path = Path.of(pfad);
        DateiInfos dateiInfos = new DateiInfos();
        dateiInfos.absoluterPfad = path.toAbsolutePath().toString();
        dateiInfos.existiert = Files.exists(path);
        File file = dateiInfos.existiert ? path.toFile() : null;
        if(file != null) {
            dateiInfos.letzteAenderung = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault());
            dateiInfos.groesse = file.length();
            dateiInfos.istDatei = file.isFile();
            dateiInfos.lesezugriff = file.canRead();
            dateiInfos.schreibzugriff = file.canWrite();
        }
        return dateiInfos;
    }
}
