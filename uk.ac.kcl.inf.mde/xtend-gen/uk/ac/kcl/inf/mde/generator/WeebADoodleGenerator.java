package uk.ac.kcl.inf.mde.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uk.ac.kcl.inf.mde.weebADoodle.Board;
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
    fsa.generateFile("storyboard.txt", this.doGenerateTxt(model));
    fsa.generateFile("storyboard.html", this.doGenerateHTML(model));
  }

  public String derivateTargetFileNameFor(final Board model, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }

  public String doGenerateTxt(final Board m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Number of Scenes: ");
    int _size = IteratorExtensions.size(Iterators.<Scene>filter(m.eAllContents(), Scene.class));
    _builder.append(_size, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Number of Characters: ");
    int _size_1 = IteratorExtensions.size(Iterators.<uk.ac.kcl.inf.mde.weebADoodle.Character>filter(m.eAllContents(), uk.ac.kcl.inf.mde.weebADoodle.Character.class));
    _builder.append(_size_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Number of Objects: ");
    int _size_2 = IteratorExtensions.size(Iterators.<SceneObject>filter(m.eAllContents(), SceneObject.class));
    _builder.append(_size_2, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      Iterable<Scene> _filter = Iterables.<Scene>filter(IteratorExtensions.<EObject>toIterable(m.eAllContents()), Scene.class);
      for(final Scene scene : _filter) {
        _builder.append("\t");
        String _name = scene.getName();
        _builder.append(_name, "\t");
        _builder.append(" ");
        String _value = scene.getValue();
        _builder.append(_value, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _background = scene.getBackground();
        _builder.append(_background, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _description = scene.getSettings().getDescription().getDescription();
        _builder.append(_description, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _cameraShot = scene.getSettings().getCamera().getCameraShot();
        _builder.append(_cameraShot, "\t");
        _builder.append(" ");
        String _cameraAngle = scene.getSettings().getCamera().getCameraAngle();
        _builder.append(_cameraAngle, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _source = scene.getSettings().getLighting().getSource();
        _builder.append(_source, "\t");
        _builder.append(" ");
        String _direction = scene.getSettings().getLighting().getDirection();
        _builder.append(_direction, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        {
          EList<uk.ac.kcl.inf.mde.weebADoodle.Character> _characters = scene.getCharacters();
          for(final uk.ac.kcl.inf.mde.weebADoodle.Character character : _characters) {
            _builder.append("\t");
            String _name_1 = character.getName();
            _builder.append(_name_1, "\t");
            _builder.append(" ");
            String _value_1 = character.getValue();
            _builder.append(_value_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _action = character.getAction().getAction();
            _builder.append(_action, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _position = character.getPosition().getPosition();
            _builder.append(_position, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _dialogue = character.getDialogue().getDialogue();
            _builder.append(_dialogue, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _description_1 = character.getDescription().getDescription();
            _builder.append(_description_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        {
          EList<SceneObject> _objects = scene.getObjects();
          for(final SceneObject object : _objects) {
            _builder.append("\t");
            String _name_2 = object.getName();
            _builder.append(_name_2, "\t");
            _builder.append(" ");
            String _value_2 = object.getValue();
            _builder.append(_value_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _position_1 = object.getPosition().getPosition();
            _builder.append(_position_1, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _description_2 = object.getDescription().getDescription();
            _builder.append(_description_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }

  public String doGenerateHTML(final Board m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("<title>Bootstrap demo</title>");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<body>");
    _builder.newLine();
    {
      Iterable<Scene> _filter = Iterables.<Scene>filter(IteratorExtensions.<EObject>toIterable(m.eAllContents()), Scene.class);
      for(final Scene scene : _filter) {
        _builder.append("\t\t\t");
        _builder.append("<div class=\"card\" style=\"width: 18rem;\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("<div class=\"card-header\">");
        String _name = scene.getName();
        _builder.append(_name, "\t\t\t   ");
        _builder.append(" ");
        String _value = scene.getValue();
        _builder.append(_value, "\t\t\t   ");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("<svg width=\"100\" height=\"100\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("     ");
        _builder.append("<rect x=\"10\" y=\"10\" width=\"80\" height=\"80\" />");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("</svg>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("<div class=\"card-body\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("      ");
        _builder.append("<h5 class=\"card-title\">Card title</h5>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("      ");
        _builder.append("<p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card\'s content.</p>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("<ul class=\"list-group list-group-flush\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("      ");
        _builder.append("<li class=\"list-group-item\">An item</li>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("      ");
        _builder.append("<li class=\"list-group-item\">A second item</li>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("      ");
        _builder.append("<li class=\"list-group-item\">A third item</li>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("<div class=\"card-body\">");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("   ");
        _builder.append("</div>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
}
