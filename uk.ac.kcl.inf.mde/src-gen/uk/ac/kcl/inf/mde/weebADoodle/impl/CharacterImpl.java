/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.mde.weebADoodle.ActionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.DescriptionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.DialogueStatement;
import uk.ac.kcl.inf.mde.weebADoodle.PositionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getAction <em>Action</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.CharacterImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterImpl extends MinimalEObjectImpl.Container implements uk.ac.kcl.inf.mde.weebADoodle.Character
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected PositionStatement position;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ActionStatement action;

  /**
   * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogue()
   * @generated
   * @ordered
   */
  protected DialogueStatement dialogue;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected DescriptionStatement description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharacterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WeebADoodlePackage.Literals.CHARACTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PositionStatement getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPosition(PositionStatement newPosition, NotificationChain msgs)
  {
    PositionStatement oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__POSITION, oldPosition, newPosition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPosition(PositionStatement newPosition)
  {
    if (newPosition != position)
    {
      NotificationChain msgs = null;
      if (position != null)
        msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__POSITION, null, msgs);
      if (newPosition != null)
        msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__POSITION, null, msgs);
      msgs = basicSetPosition(newPosition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__POSITION, newPosition, newPosition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionStatement getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ActionStatement newAction, NotificationChain msgs)
  {
    ActionStatement oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(ActionStatement newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialogueStatement getDialogue()
  {
    return dialogue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDialogue(DialogueStatement newDialogue, NotificationChain msgs)
  {
    DialogueStatement oldDialogue = dialogue;
    dialogue = newDialogue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__DIALOGUE, oldDialogue, newDialogue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDialogue(DialogueStatement newDialogue)
  {
    if (newDialogue != dialogue)
    {
      NotificationChain msgs = null;
      if (dialogue != null)
        msgs = ((InternalEObject)dialogue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__DIALOGUE, null, msgs);
      if (newDialogue != null)
        msgs = ((InternalEObject)newDialogue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__DIALOGUE, null, msgs);
      msgs = basicSetDialogue(newDialogue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__DIALOGUE, newDialogue, newDialogue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DescriptionStatement getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(DescriptionStatement newDescription, NotificationChain msgs)
  {
    DescriptionStatement oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(DescriptionStatement newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.CHARACTER__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.CHARACTER__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.CHARACTER__POSITION:
        return basicSetPosition(null, msgs);
      case WeebADoodlePackage.CHARACTER__ACTION:
        return basicSetAction(null, msgs);
      case WeebADoodlePackage.CHARACTER__DIALOGUE:
        return basicSetDialogue(null, msgs);
      case WeebADoodlePackage.CHARACTER__DESCRIPTION:
        return basicSetDescription(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.CHARACTER__NAME:
        return getName();
      case WeebADoodlePackage.CHARACTER__VALUE:
        return getValue();
      case WeebADoodlePackage.CHARACTER__POSITION:
        return getPosition();
      case WeebADoodlePackage.CHARACTER__ACTION:
        return getAction();
      case WeebADoodlePackage.CHARACTER__DIALOGUE:
        return getDialogue();
      case WeebADoodlePackage.CHARACTER__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.CHARACTER__NAME:
        setName((String)newValue);
        return;
      case WeebADoodlePackage.CHARACTER__VALUE:
        setValue((String)newValue);
        return;
      case WeebADoodlePackage.CHARACTER__POSITION:
        setPosition((PositionStatement)newValue);
        return;
      case WeebADoodlePackage.CHARACTER__ACTION:
        setAction((ActionStatement)newValue);
        return;
      case WeebADoodlePackage.CHARACTER__DIALOGUE:
        setDialogue((DialogueStatement)newValue);
        return;
      case WeebADoodlePackage.CHARACTER__DESCRIPTION:
        setDescription((DescriptionStatement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.CHARACTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WeebADoodlePackage.CHARACTER__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case WeebADoodlePackage.CHARACTER__POSITION:
        setPosition((PositionStatement)null);
        return;
      case WeebADoodlePackage.CHARACTER__ACTION:
        setAction((ActionStatement)null);
        return;
      case WeebADoodlePackage.CHARACTER__DIALOGUE:
        setDialogue((DialogueStatement)null);
        return;
      case WeebADoodlePackage.CHARACTER__DESCRIPTION:
        setDescription((DescriptionStatement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.CHARACTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WeebADoodlePackage.CHARACTER__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case WeebADoodlePackage.CHARACTER__POSITION:
        return position != null;
      case WeebADoodlePackage.CHARACTER__ACTION:
        return action != null;
      case WeebADoodlePackage.CHARACTER__DIALOGUE:
        return dialogue != null;
      case WeebADoodlePackage.CHARACTER__DESCRIPTION:
        return description != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //CharacterImpl