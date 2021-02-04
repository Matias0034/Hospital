import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor(
                "Robinson Aguilar",
                "zerodata.aolik@outlook.com ",
                "AV colonia",
                "Psiquiatra",
                854523303
        );

        Patient myPatient = new Patient(
                "alejandra",
                "email",
                "TIPO A",
                new Date(),
                345,
                183
        );

        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"5Am");
        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println("el doctor "+myDoctor.getName()+", con el correo de "+myDoctor.getEmail()+" tiene una cita en la fecha de "+availableAppointment.getDate()+" a las "+availableAppointment.getTime());
        }

        Doctor.AvailableAppointment a = myDoctor.new AvailableAppointment(new Date(),"3");
        System.out.println(myPatient);


    }



}
