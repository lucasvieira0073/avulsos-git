@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView getBusca(@RequestParam(value = "idtstore", required = false) int idtstore,
         HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView;

        switch (idtstore) {
        case 1:
            modelAndView = new ModelAndView("home1");
            break;

        default:
            modelAndView = new ModelAndView("home2");
            break;
        }

        return modelAndView;
    }
}
