package code
package snippet

import model._

import net.liftweb._
import http._

object MyScreen extends LiftScreen {
  object myRecord extends ScreenVar(MyRecord.createRecord)

  addFields(() => myRecord.is)
  
  val isSave = field("Save ?", false, FormFieldId("id_isSaved_field"))
  val category = field("Category", "None", FormFieldId("id_category_field"))
  val amount = field("Quantity", 2, FormFieldId("id_quantity_field"))
  
  val comment = text("Comment", "no comment")
  
  def finish() = {
    S.notice("Finished")
  }
}
