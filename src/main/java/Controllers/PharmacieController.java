package Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Entities.Medicament;
import static com.fst.first.DsSbApplication.medicaments;
@Controller
@RequestMapping("medicaments")
public class PharmacieController {
@RequestMapping("list")
public String ListMedicaments (Model model) {
	for(Medicament m:medicaments)
	{
		model.addAttribute("m",m);

}
	return "affMed";
} 
@PostMapping("add")
public String  ajouter (@RequestParam("id")int id, @RequestParam("nom")
String nom, @RequestParam("quantity")double quantity,
 @RequestParam("prix") double prix)
{
		Medicament m= new Medicament(id,nom,quantity,prix);
		medicaments.add(m);
		
		return"redirect:listMed";
	
	}
@GetMapping("supprimer/{id}")
public String supprimer(@PathVariable("id") int id)
{
	for(Medicament m : medicaments) {
		if(id==m.getId()) {
			medicaments.remove(m);
		break;
	}
	}
	return "redirect:../list";
}

	

}

