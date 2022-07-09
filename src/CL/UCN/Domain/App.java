/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CL.UCN.Domain;

import Win.Interface;

public class App
{
    public static void main(String[] args)
    {
        FakeStoreSystemImpl sistema = new FakeStoreSystemImpl();
        System.out.print("MAIN");
        Interface in = new Interface();
        in.setSystem(sistema);
        in.show();
    }
}
