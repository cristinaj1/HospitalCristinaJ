/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Cris
 */
public class GestionHospital {

    private static Hospital hospiten;

    //Esto lo tengo que rehacer con más tiempo y modificarlo mejor
    private ArrayList<Empleado> crearMedico() {
        ArrayList<Empleado> listaMed = new ArrayList<>();
        return listaMed;
    }

    private ArrayList<Empleado> crearAdministrativo() {
        ArrayList<Empleado> listaAdmin = new ArrayList<>();
        return listaAdmin;
    }

    private ArrayList<Paciente> crearPaciente() {
        ArrayList<Paciente> listaPa = new ArrayList<>();
        return listaPa;
    }

    public static void main(String[] args) {
        //Preguntar a Vico duda sobre si cuando añades algo lo añade al set o al arrayList(antes de la recu)
        //Crear el hospital
        hospiten = new Hospital("Hospiten", "Carretera Nacional 340, Km. 162", 390);

        //crear médico
        Medico med1 = new Medico("Cardiología", "363-16-7472", 1200, "Bruno", "Fonseca Santiago", 17894000, LocalDate.of(2018, Month.APRIL, 5));
        Medico med2 = new Medico("Medicina Nuclear", "261-38-6330", 2200, "Emilio Jose", "Fonseca Santiago", 705495000, LocalDate.of(2020, Month.DECEMBER, 2));

        //Contratar empleado
        System.out.println("------------------------------------CONTRATAR MÉDICOS------------------------------------------");
        hospiten.contratarEmpleado(med1);
        hospiten.contratarEmpleado(med2);

        //Crear Administrativos
        Administrativos admin1 = new Administrativos(TipoAdministrativos.GRUPO_A, "319-20-6804", 900, "Belén", "Cardenas Amoros", 05117305, LocalDate.of(2018, Month.MARCH, 7));
        Administrativos admin2 = new Administrativos(TipoAdministrativos.GRUPO_B, "004-09-3562", 1000, "Ramon", "Oliveira Zhang", 54850000, LocalDate.of(2016, Month.SEPTEMBER, 1));
        Administrativos admin3 = new Administrativos(TipoAdministrativos.GRUPO_B, "680-56-5313", 1080, "Luis Enrique", "Redondo Galera", 69781000, LocalDate.of(2018, Month.NOVEMBER, 5));

        //Contratar empleado
        System.out.println(" ");
        System.out.println("------------------------------------CONTRATAR ADMINISTRATIVOS------------------------------------------");
        hospiten.contratarEmpleado(admin1);
        hospiten.contratarEmpleado(admin2);
        hospiten.contratarEmpleado(admin3);
        //Angel lo hace con arrayList, yo lo veo así más fácil
        //Pacientes
        Paciente pac1 = new Paciente("0000000000001", "Manuela", "Gavira Cortés", 4571800, LocalDate.of(2020, Month.MARCH, 17));
        Paciente pac2 = new Paciente("0000000000002", "Magdalena", "Rivero Martín", 7894500, LocalDate.of(2019, Month.MARCH, 30));
        Paciente pac3 = new Paciente("0000000000003", "Ángel", "Buendia Jiménez", 1234500, LocalDate.of(2020, Month.APRIL, 27));
        Paciente pac4 = new Paciente("0000000000004", "Dario", "Botella Ortuño", 9547800, LocalDate.of(2018, Month.AUGUST, 5));
        Paciente pac5 = new Paciente("0000000000005", "Martin", "Agudo Lara", 6243100, LocalDate.of(2019, Month.NOVEMBER, 4));

        //Ingreso de pacientes
        System.out.println(" ");
        System.out.println("------------------------------------INGRESO DE PACIENTES------------------------------------------");
        hospiten.ingresarPaciente(pac1);
        hospiten.ingresarPaciente(pac2);
        hospiten.ingresarPaciente(pac3);
        hospiten.ingresarPaciente(pac4);
        hospiten.ingresarPaciente(pac5);

        //Calculos de IRPF(ejemplo de cada caso de empleado para ver funcionalidad)
        System.out.println("   ");
        System.out.println("------------------------------------CÁLCULAR IRPF------------------------------------------");
        System.out.println("El médico " + med1.getNombre() + " paga de IRPF: " + med1.calcularIRPF() + "€");
        System.out.println("El médico " + admin1.getNombre() + " paga de IRPF: " + admin2.calcularIRPF() + "€");

        //Registrar documento(se llama a un administrador para que así se vea que se ejecuta correctamente el método)
        System.out.println("   ");
        System.out.println("------------------------------------REGISTRAR DOCUMENTO------------------------------------------");
        admin1.registrarDocumento();

        //Tratar al paciente con paracetamol
        System.out.println("");
        System.out.println("------------------------------------DAR PARACETAMOL AL PACIENTE------------------------------------------");
        med1.tratar(pac5, "Paracetamol");

        //Método abstracto
        System.out.println("");
        System.out.println("------------------------------------MÉTODO ABSTRACTO------------------------------------------");
        med1.descansoComida();
        med2.descansoComida();
        System.out.println("");
        admin1.descansoComida();
        admin2.descansoComida();
        admin3.descansoComida();
    }

}
