// generated by Xtext 2.29.0
package uk.ac.kcl.inf.mde.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.mde.weebADoodle.Board
import uk.ac.kcl.inf.mde.weebADoodle.Scene
import uk.ac.kcl.inf.mde.weebADoodle.Character
import uk.ac.kcl.inf.mde.weebADoodle.SceneObject
import uk.ac.kcl.inf.mde.weebADoodle.Setting

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WeebADoodleGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as Board
		fsa.generateFile(derivateTargetScriptFileNameFor(model, resource), model.doGenerateTxt)
		fsa.generateFile(derivateTargetBoardFileNameFor(model, resource), model.doGenerateHTML)

	}

	def derivateTargetScriptFileNameFor(Board model, Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def derivateTargetBoardFileNameFor(Board model, Resource resource) {
		resource.URI.appendFileExtension('html').lastSegment
	}

	def String doGenerateTxt(Board m) '''
		
				Script Title: «m.title»
				
				«FOR scene : m.eAllContents.toIterable.filter(Scene)»
					«scene.name» «scene.value»
					BG: «scene.background»
					Setting: «scene.settings.description.description»
					Camera: «scene.settings.camera.cameraShot» «scene.settings.camera.cameraAngle»
					Lighting: «scene.settings.lighting.source» «scene.settings.lighting.direction»
					
					«FOR character : scene.characters»
						«character.name» «character.value»
						«IF character.dialogue !== null»
						    Dialogue: «character.dialogue.dialogue»
						«ENDIF»
						«IF character.action !== null»
						    *«character.action.action»*
						«ENDIF»
						«IF character.position !== null»
						    [«character.position.position»]
						«ENDIF»
						«IF character.description !== null»
						    («character.description.description»)
						«ENDIF»
						
					«ENDFOR»
					
					«FOR object: scene.objects»
						Object: «object.name» «object.value»
						[at «object.position.position»]
						(«object.description.description»)
					«ENDFOR»
					
					---
					
				«ENDFOR»
				
	'''

	def String doGenerateHTML(Board m) '''
		<!doctype html>
		<html lang="en">
		  <head>
		    <meta charset="utf-8">
		    <meta name="viewport" content="width=device-width, initial-scale=1">
		    <title>Storyboard</title>
		    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
		  </head>
		  <body>
		  
		  <br>
		  <h1 class="text-center">«m.title»</h1>
		  <br><br><br>
		  
			<div class="card-deck">
			  <div class="row">
			    «FOR scene : m.eAllContents.toIterable.filter(Scene)»
			    	<div class="col-md-4 mb-3">
			    	  <div class="card h-100">
			    	    <div class="card-header">
		                    <div class="row">
		                      <div class="col-7"><span>«scene.name» - «scene.value»</span></div>
		                      <div class="col-5 text-end"><span>BG: «scene.background»</span></div>
		                    </div>
		                  </div>
			    	    <div class="card-body">
			    	      <div class="row">
			    	        <div class="col-8"><div class="bordered" style="height: 150px;"></div></div>
			    	        <div class="col-4"><div class="bordered" style="height: 300px;"></div></div>
			    	      </div>
			    	      
			    	      <h6 class="card-title">
			    	      
			    	      Camera: «scene.settings.camera.cameraShot»
			    	      «IF scene.settings.camera.cameraAngle !== null»
			    	       from «scene.settings.camera.cameraAngle»
			    	       «ENDIF»
			    	      <br>
			    	      Lighting: «scene.settings.lighting.source»
			    	      «IF scene.settings.lighting.direction !== null»
   			    	       from «scene.settings.lighting.direction»
  			    	       «ENDIF»
  			    	       
			    	      </h6>
			    	      
			    	      <p class="card-text"></p>
			    	      <ul class="list-group list-group-flush">
			    	        <li class="list-group-item">«scene.settings.description.description»</li>
			    	        «FOR character : scene.characters»
		    	        		<li class="list-group-item">«character.name» «character.value»<br>
								«IF character.action !== null»
							    	*<i>«character.action.action»</i>*<br>
								«ENDIF»
								«IF character.description !== null»
							    	(«character.description.description»)<br>
								«ENDIF»
								«IF character.position !== null»
							    	[«character.position.position»]<br>
								«ENDIF»
								«IF character.dialogue !== null»
							    	<p class="h6">Dialogue: «character.dialogue.dialogue»</p>
								«ENDIF»
								
								</li>
								
			    	        «ENDFOR»
			    	        
			    	        «FOR object: scene.objects»
			    	        	<li class="list-group-item">
        						Object: «object.value» at «object.position.position»<br>
        						(«object.description.description»)
        						</li>
        					«ENDFOR»
			    	        
			    	      </ul>
			    	    </div>
			    	  </div>
			    	</div>
			    «ENDFOR»
			  </div>
			</div>
		
		    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
		  </body>
		</html>
		
	'''

}
