package calculator

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.Includes._
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import javafx.{scene => jfxs}
import scalafx.collections.{ObservableBuffer}
import scalafx.stage.{ Stage, Modality }


object MainApp extends JFXApp {
 
  // transform path of RootLayout.fxml to URI for resource location.
  val rootResource = getClass.getResourceAsStream("view/RootLayout.fxml")
  // initialize the loader object.
  val loader = new FXMLLoader(null, NoDependencyResolver)
  // Load root layout from fxml file.
  loader.load(rootResource);
  // retrieve the root component BorderPane from the FXML 
  val roots = loader.getRoot[jfxs.layout.BorderPane]
  // initialize stage
  stage = new PrimaryStage {
    title = "Calculator"
    scene = new Scene {
      root = roots
    }
  }
  def showCalculator() = {
    val resource = getClass.getResourceAsStream("view/calculator.fxml")
    val loader = new FXMLLoader(null, NoDependencyResolver)
    loader.load(resource);
    val roots = loader.getRoot[jfxs.layout.AnchorPane]
    this.roots.setCenter(roots)
  } 

  showCalculator()
}