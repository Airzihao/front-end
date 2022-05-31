package org.opencypher.v9_0.expressions

import org.opencypher.v9_0.util.InputPosition

 /**
 * @Author: Airzihao
 * @Description:
 * @Date: Created at 16:08 2022/5/29
 * @Modified By:
 */

trait VerNum {
  def asCanonicalString: String;
}

case class ASTVersionNumberLiteral(value: VerNum)(val position: InputPosition) extends Expression {
  override def asCanonicalStringVal = value.asCanonicalString
}

case class PlainVersionNumber(plainVersionNumber: String) extends VerNum {
  override def asCanonicalString: String = plainVersionNumber
}