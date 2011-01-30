package code
package snippet

import model._

import net.liftweb._
import http._

object MyScreen extends LiftScreen {
  object myRecord extends ScreenVar(MyRecord.createRecord)

  addFields(() => myRecord.is)
  
  val isSave = field("Save ?", false, FormFieldId("id_isSaved"))
  
  def finish() = {
    S.notice("Finished")
  }
}
