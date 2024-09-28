using System.Collections;
using System.Collections.Generic;
using UnityEngine;

//This script will demonstrate many ways of moving object

public class Movement : MonoBehaviour
{
    [SerializeField] bool useManualMovement;
    [SerializeField] bool useTransformTranslate;
    [SerializeField] bool useVelocity;
    [SerializeField] bool useForce;

    void Update()
    {
        if (useManualMovement)
        {
            ManuallyMoveObject();
        }
        else if (useTransformTranslate)
        {
            TranslateObject();
        }
        else if (useVelocity)
        {
            GiveObjectVelocity();
        }
        else if (useForce)
        {
            ApplyForce();
        }
    }

    void ManuallyMoveObject()
    {
        //Color coding object to red
        GetComponent<MeshRenderer>().material.color = Color.red;


        //Add vector value to the object's transform.position

        Vector3 moveAmount = new Vector3(1, 1, 1); //Create a Vector3 to add to the object's xyz position
        moveAmount *= Time.deltaTime; //Multiply vector by Time.DeltaTime (Removes frame dependent movement)
        transform.position += moveAmount; //Add the vector the the object's transform.position
    }


    void TranslateObject()
    {
        //Color coding object to green
        GetComponent<MeshRenderer>().material.color = Color.green;


        //Call transform.Translate() method to move object by vector values

        Vector3 moveAmount = new Vector3(1, 1, 1); //Create a Vector3 to add to the object's xyz position
        moveAmount *= Time.deltaTime; //Multiply vector by Time.DeltaTime (Removes frame dependent movement)
        transform.Translate(moveAmount); //Translate the object by the move amount
    }


    void GiveObjectVelocity()
    {
        //Color coding object to blue
        GetComponent<MeshRenderer>().material.color = Color.blue;


        //Veloctiy = Distance(m)/Time(s). Thus, the object will move x,y, and z units every second

        Rigidbody rb = GetComponent<Rigidbody>(); //Get the rigidbody component on the object
        Vector3 moveAmount = new Vector3(1, 1, 1); //Create a Vector3 to apply to the object's rigidbody
        rb.velocity = moveAmount; //Set the obejct velocity to the move amount
    }


    void ApplyForce()
    {
        //Color coding object to yellow
        GetComponent<MeshRenderer>().material.color = Color.yellow;


        //F=ma. Thus, the adding a force to an object will cause it to increase/decrease in velocity based on the direction of the force.
        //(Velocity is constantly changing)

        Rigidbody rb = GetComponent<Rigidbody>(); //Get the rigidbody component on the object
        Vector3 moveAmount = new Vector3(1, 1, 1); //Create a Vector3 to apply to the object's rigidbody
        rb.AddForce(moveAmount); //Apply the force of the move amount
    }

}

