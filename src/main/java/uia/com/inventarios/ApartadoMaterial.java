package uia.com.inventarios;

import java.util.Map;

public class ApartadoMaterial {

    void buscaSolicitudPorID(int id){
        SolicitudSalidaMaterial sol = null;
        id = 1;
        if (id >0 && id == sol.getId()){
            System.out.println("ID valido");
        }else {
            System.out.println("ID invalido");
        }
    }

    SolicitudMaterialTemporal seleccionaIDSolicitudTemporal(SolicitudMaterialTemporal temp2, String id){
            System.out.println("----- Solicitudes -----");
            temp2.getItems();
            // ESTA MAL --
            for (Map.Entry<String, InfoItem> temp : temp2.getItems().entrySet()) {
                SolicitudMaterialTemporal nodo = (SolicitudMaterialTemporal) temp.getValue();
                nodo.print();
            }
            // cuando seleccione el ID
        temp2.setEstatus("apartado");
            // falta un return que regrese en estado apartado

        return temp2.setEstatus("apartado");
    }

    }

