package salat

import com.novus.salat._
import com.novus.salat.dao._
import com.novus.salat.global._

import com.mongodb.casbah.Imports._

case class Employee(_id:ObjectId = new ObjectId, name: String, age: Option[Int]=None, annual_salary: Option[BigDecimal]=None)

object EmployeeDAO
  extends SalatDAO[Employee, ObjectId](collection = MongoConnection()("salat_test")("employees"))

object App{
  def main(args:Array[String]){
    val employee = Employee(name="Foo")

    val id = EmployeeDAO.insert(employee)
    println("Inserted id:" + id)

    val found = EmployeeDAO.findOne(MongoDBObject("name" -> "Foo"))
    println("Found record for name ->Foo:" + found)

    val dbo = grater[Employee].asDBObject(employee)
    println("Converted DBObject:" + dbo)
  }
}

