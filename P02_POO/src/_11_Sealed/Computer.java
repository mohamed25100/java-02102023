package _11_Sealed;

/*
 * La classe 'Computer' autorise l'héritage de 2 classes : 'Desktop' et 'Laptop'
 */
public sealed class Computer permits Desktop, Laptop{

}
