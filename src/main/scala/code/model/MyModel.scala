package code
package model

import net.liftweb._
import record._
import field._

class MyRecord extends Record[MyRecord] {
  def meta = MyRecord
  
  object bool extends BooleanField(this)
}

object MyRecord extends MyRecord with MetaRecord[MyRecord] {
}
