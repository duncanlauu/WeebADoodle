/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Action#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Setting
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.mde.weebADoodle.ActionCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' attribute.
   * @see uk.ac.kcl.inf.mde.weebADoodle.ActionCommand
   * @see #setCommand(ActionCommand)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getAction_Command()
   * @model
   * @generated
   */
  ActionCommand getCommand();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Action#getCommand <em>Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command</em>' attribute.
   * @see uk.ac.kcl.inf.mde.weebADoodle.ActionCommand
   * @see #getCommand()
   * @generated
   */
  void setCommand(ActionCommand value);

} // Action
