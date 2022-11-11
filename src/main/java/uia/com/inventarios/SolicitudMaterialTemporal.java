package uia.com.inventarios;

import java.util.HashMap;

public class SolicitudMaterialTemporal extends InfoItem{

    private HashMap<String, SolicitudSalidaMaterial> solicitudes = new HashMap<String, SolicitudSalidaMaterial>();

    public SolicitudMaterialTemporal(String id, String name, String estatus) {
        super(id, name, estatus);
    }

    public HashMap<String, SolicitudSalidaMaterial> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(HashMap<String, SolicitudSalidaMaterial> solicitudes) {
        this.solicitudes = solicitudes;
    }
}
