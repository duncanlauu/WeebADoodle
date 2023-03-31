package uk.ac.kcl.inf.mde.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uk.ac.kcl.inf.mde.weebADoodle.ActionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.Board;
import uk.ac.kcl.inf.mde.weebADoodle.DescriptionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.DialogueStatement;
import uk.ac.kcl.inf.mde.weebADoodle.PositionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.Scene;
import uk.ac.kcl.inf.mde.weebADoodle.SceneObject;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class WeebADoodleGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Board model = ((Board) _head);
    fsa.generateFile(this.derivateTargetScriptFileNameFor(model, resource), this.doGenerateTxt(model));
    fsa.generateFile(this.derivateTargetBoardFileNameFor(model, resource), this.doGenerateHTML(model));
  }

  public String derivateTargetScriptFileNameFor(final Board model, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }

  public String derivateTargetBoardFileNameFor(final Board model, final Resource resource) {
    return resource.getURI().appendFileExtension("html").lastSegment();
  }

  public String doGenerateTxt(final Board m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Script Title: ");
    String _title = m.getTitle();
    _builder.append(_title, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      Iterable<Scene> _filter = Iterables.<Scene>filter(IteratorExtensions.<EObject>toIterable(m.eAllContents()), Scene.class);
      for(final Scene scene : _filter) {
        _builder.append("\t\t");
        String _name = scene.getName();
        _builder.append(_name, "\t\t");
        _builder.append(" ");
        String _value = scene.getValue();
        _builder.append(_value, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("BG: ");
        String _background = scene.getBackground();
        _builder.append(_background, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("Setting: ");
        String _description = scene.getSettings().getDescription().getDescription();
        _builder.append(_description, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("Camera: ");
        String _cameraShot = scene.getSettings().getCamera().getCameraShot();
        _builder.append(_cameraShot, "\t\t");
        _builder.append(" ");
        String _cameraAngle = scene.getSettings().getCamera().getCameraAngle();
        _builder.append(_cameraAngle, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("Lighting: ");
        String _source = scene.getSettings().getLighting().getSource();
        _builder.append(_source, "\t\t");
        _builder.append(" ");
        String _direction = scene.getSettings().getLighting().getDirection();
        _builder.append(_direction, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<uk.ac.kcl.inf.mde.weebADoodle.Character> _characters = scene.getCharacters();
          for(final uk.ac.kcl.inf.mde.weebADoodle.Character character : _characters) {
            _builder.append("\t\t");
            String _name_1 = character.getName();
            _builder.append(_name_1, "\t\t");
            _builder.append(" ");
            String _value_1 = character.getValue();
            _builder.append(_value_1, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              DialogueStatement _dialogue = character.getDialogue();
              boolean _tripleNotEquals = (_dialogue != null);
              if (_tripleNotEquals) {
                _builder.append("\t\t");
                _builder.append("Dialogue: ");
                String _dialogue_1 = character.getDialogue().getDialogue();
                _builder.append(_dialogue_1, "\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              ActionStatement _action = character.getAction();
              boolean _tripleNotEquals_1 = (_action != null);
              if (_tripleNotEquals_1) {
                _builder.append("\t\t");
                _builder.append("*");
                String _action_1 = character.getAction().getAction();
                _builder.append(_action_1, "\t\t");
                _builder.append("*");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              PositionStatement _position = character.getPosition();
              boolean _tripleNotEquals_2 = (_position != null);
              if (_tripleNotEquals_2) {
                _builder.append("\t\t");
                _builder.append("[");
                String _position_1 = character.getPosition().getPosition();
                _builder.append(_position_1, "\t\t");
                _builder.append("]");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              DescriptionStatement _description_1 = character.getDescription();
              boolean _tripleNotEquals_3 = (_description_1 != null);
              if (_tripleNotEquals_3) {
                _builder.append("\t\t");
                _builder.append("(");
                String _description_2 = character.getDescription().getDescription();
                _builder.append(_description_2, "\t\t");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
        {
          EList<SceneObject> _objects = scene.getObjects();
          for(final SceneObject object : _objects) {
            _builder.append("\t\t");
            _builder.append("Object: ");
            String _name_2 = object.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append(" ");
            String _value_2 = object.getValue();
            _builder.append(_value_2, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("[at ");
            String _position_2 = object.getPosition().getPosition();
            _builder.append(_position_2, "\t\t");
            _builder.append("]");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("(");
            String _description_3 = object.getDescription().getDescription();
            _builder.append(_description_3, "\t\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("---");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    return _builder.toString();
  }

  public String doGenerateHTML(final Board m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>Storyboard</title>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<br>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<h1 class=\"text-center\">");
    String _title = m.getTitle();
    _builder.append(_title, "  ");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<br><br><br>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"card-deck\">");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    {
      Iterable<Scene> _filter = Iterables.<Scene>filter(IteratorExtensions.<EObject>toIterable(m.eAllContents()), Scene.class);
      for(final Scene scene : _filter) {
        _builder.append("\t    ");
        _builder.append("<div class=\"col-md-4 mb-3\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("  ");
        _builder.append("<div class=\"card h-100\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("    ");
        _builder.append("<div class=\"card-header\">");
        _builder.newLine();
        _builder.append("\t\t                    ");
        _builder.append("<div class=\"row\">");
        _builder.newLine();
        _builder.append("\t\t                      ");
        _builder.append("<div class=\"col-7\"><span>");
        String _name = scene.getName();
        _builder.append(_name, "\t\t                      ");
        _builder.append(" - ");
        String _value = scene.getValue();
        _builder.append(_value, "\t\t                      ");
        _builder.append("</span></div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t                      ");
        _builder.append("<div class=\"col-5 text-end\"><span>BG: ");
        String _background = scene.getBackground();
        _builder.append(_background, "\t\t                      ");
        _builder.append("</span></div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t                    ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t                  ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("    ");
        _builder.append("<div class=\"card-body\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("<div class=\"row\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("        ");
        _builder.append("<div class=\"col-8\"><div class=\"bordered\" style=\"height: 150px;\"></div></div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("        ");
        _builder.append("<div class=\"col-4\"><div class=\"bordered\" style=\"height: 300px;\"></div></div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("<h6 class=\"card-title\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("Camera: ");
        String _cameraShot = scene.getSettings().getCamera().getCameraShot();
        _builder.append(_cameraShot, "\t          ");
        _builder.newLineIfNotEmpty();
        {
          String _cameraAngle = scene.getSettings().getCamera().getCameraAngle();
          boolean _tripleNotEquals = (_cameraAngle != null);
          if (_tripleNotEquals) {
            _builder.append("\t    ");
            _builder.append("      ");
            _builder.append("from ");
            String _cameraAngle_1 = scene.getSettings().getCamera().getCameraAngle();
            _builder.append(_cameraAngle_1, "\t          ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("<br>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("Lighting: ");
        String _source = scene.getSettings().getLighting().getSource();
        _builder.append(_source, "\t          ");
        _builder.newLineIfNotEmpty();
        {
          String _direction = scene.getSettings().getLighting().getDirection();
          boolean _tripleNotEquals_1 = (_direction != null);
          if (_tripleNotEquals_1) {
            _builder.append("from ");
            String _direction_1 = scene.getSettings().getLighting().getDirection();
            _builder.append(_direction_1);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("  \t\t\t    \t       ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("</h6>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("<p class=\"card-text\"></p>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("<ul class=\"list-group list-group-flush\">");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("        ");
        _builder.append("<li class=\"list-group-item\">");
        String _description = scene.getSettings().getDescription().getDescription();
        _builder.append(_description, "\t            ");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
        {
          EList<uk.ac.kcl.inf.mde.weebADoodle.Character> _characters = scene.getCharacters();
          for(final uk.ac.kcl.inf.mde.weebADoodle.Character character : _characters) {
            _builder.append("\t\t    \t        \t\t");
            _builder.append("<li class=\"list-group-item\">");
            String _name_1 = character.getName();
            _builder.append(_name_1, "\t\t    \t        \t\t");
            _builder.append(" ");
            String _value_1 = character.getValue();
            _builder.append(_value_1, "\t\t    \t        \t\t");
            _builder.append("<br>");
            _builder.newLineIfNotEmpty();
            {
              ActionStatement _action = character.getAction();
              boolean _tripleNotEquals_2 = (_action != null);
              if (_tripleNotEquals_2) {
                _builder.append("*<i>");
                String _action_1 = character.getAction().getAction();
                _builder.append(_action_1);
                _builder.append("</i>*<br>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              DescriptionStatement _description_1 = character.getDescription();
              boolean _tripleNotEquals_3 = (_description_1 != null);
              if (_tripleNotEquals_3) {
                _builder.append("(");
                String _description_2 = character.getDescription().getDescription();
                _builder.append(_description_2);
                _builder.append(")<br>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              PositionStatement _position = character.getPosition();
              boolean _tripleNotEquals_4 = (_position != null);
              if (_tripleNotEquals_4) {
                _builder.append("[");
                String _position_1 = character.getPosition().getPosition();
                _builder.append(_position_1);
                _builder.append("]<br>");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              DialogueStatement _dialogue = character.getDialogue();
              boolean _tripleNotEquals_5 = (_dialogue != null);
              if (_tripleNotEquals_5) {
                _builder.append("<p class=\"h6\">Dialogue: ");
                String _dialogue_1 = character.getDialogue().getDialogue();
                _builder.append(_dialogue_1);
                _builder.append("</p>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.newLine();
            _builder.append("</li>");
            _builder.newLine();
            _builder.newLine();
          }
        }
        _builder.append("\t    ");
        _builder.append("        ");
        _builder.newLine();
        {
          EList<SceneObject> _objects = scene.getObjects();
          for(final SceneObject object : _objects) {
            _builder.append("\t\t\t    \t        \t");
            _builder.append("<li class=\"list-group-item\">");
            _builder.newLine();
            _builder.append("Object: ");
            String _value_2 = object.getValue();
            _builder.append(_value_2);
            _builder.append(" at ");
            String _position_2 = object.getPosition().getPosition();
            _builder.append(_position_2);
            _builder.append("<br>");
            _builder.newLineIfNotEmpty();
            _builder.append("(");
            String _description_3 = object.getDescription().getDescription();
            _builder.append(_description_3);
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("</li>");
            _builder.newLine();
          }
        }
        _builder.append("\t    ");
        _builder.append("        ");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("      ");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("    ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("  ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t    ");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t  ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
