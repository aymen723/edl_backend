package com.example.edl_backend.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Models.modulemodel;
import com.example.edl_backend.Models.specialitemodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.Modulerepo;
import com.example.edl_backend.services.Adminservice;
import com.example.edl_backend.services.Vice_doyenservice;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Vicedoyen")
public class vice_doyencontroller {

    @Autowired
    private Vice_doyenservice viceser;

    @PostMapping("/Addconcur")
    public String addconcur(@RequestBody infoconcourmodel concur, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.addconcur(concur);
            }
            return "concur   has been added";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @DeleteMapping("/Suppconcur")
    public String suppconcur(@RequestParam String id, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.suppconcur(id);
            }
            return "concur has been deleted ";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @PutMapping("/modconcur")
    public ResponseEntity<infoconcourmodel> modconcur(@RequestParam String Id,
            @RequestBody infoconcourmodel updatedDocument, HttpSession session) {
        infoconcourmodel modifiedDocument = new infoconcourmodel();
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                modifiedDocument = viceser.modconcur(Id, updatedDocument);
            }

            return ResponseEntity.ok(modifiedDocument);

        } catch (RuntimeException e) {
            // Handle the case when the document is not found or other error occurs
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/getconcurs")
    public ResponseEntity<List<infoconcourmodel>> getconcurs(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                return new ResponseEntity<List<infoconcourmodel>>(viceser.getallconcurs(), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PostMapping("/Addspeacialite")
    public String addspeacialite(@RequestBody specialitemodel speacliteinfo, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.addspeacialite(speacliteinfo);
            }
            return "speacialite has been added";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @DeleteMapping("/Supspeacialite")
    public String Supspeacialite(@RequestParam String id, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.suppspeacialite(id);
            }
            return "concur has been deleted ";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @PutMapping("/Modspeacialite")
    public ResponseEntity<infoconcourmodel> Modspeacialite(@RequestParam String Id,
            @RequestBody infoconcourmodel updatedDocument, HttpSession session) {
        infoconcourmodel modifiedDocument = new infoconcourmodel();
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                modifiedDocument = viceser.modconcur(Id, updatedDocument);
            }

            return ResponseEntity.ok(modifiedDocument);

        } catch (RuntimeException e) {
            // Handle the case when the document is not found or other error occurs
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/getspeacialites")
    public ResponseEntity<List<specialitemodel>> getspecialites(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                return new ResponseEntity<List<specialitemodel>>(viceser.getallspeacialite(), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PostMapping("/Addmodule")
    public String Addmodule(@RequestBody modulemodel module, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            System.out.println(usersession.getUsername());
            System.out.println(usersession.getRole());
            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.addmodule(module);
            }
            // viceser.addmodule(module);

            return "module has been added";
        } catch (Exception e) {
            // TODO: handle exception
        }

        return null;
    }

    @DeleteMapping("/Suppmodule")
    public String Suppmodule(@RequestParam String id, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                viceser.suppmodule(id);
            }
            return "concur has been deleted ";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @GetMapping("/getmodules")
    public ResponseEntity<List<modulemodel>> getmodules(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                return new ResponseEntity<List<modulemodel>>(viceser.getallmodules(), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/test")
    public Optional<modulemodel> test(@RequestParam String id) {

        return viceser.findbyid(id);
    }

    @PutMapping("/Modmodule")
    public ResponseEntity<modulemodel> modmodule(@RequestParam String Id,
            @RequestBody modulemodel updatedDocument, HttpSession session) {
        modulemodel modifiedDocument = new modulemodel();
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                modifiedDocument = viceser.modmodule(Id, updatedDocument);
            }

            return ResponseEntity.ok(modifiedDocument);

        } catch (RuntimeException e) {
            // Handle the case when the document is not found or other error occurs
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // @GetMapping("/getusers")
    // public ResponseEntity<List<usermodel>> listuser(HttpSession session) {
    // try {
    // usermodel usersession = (usermodel) session.getAttribute("user");
    // if (usersession.getRole() == erole.VICE_DOYEN) {
    // return new ResponseEntity<List<usermodel>>(viceser.getalluser(),
    // HttpStatus.OK);
    // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println(e.getMessage());
    // }
    // return null;
    // }

    @GetMapping("/getetd")
    public ResponseEntity<List<usermodel>> listetd(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {

                return new ResponseEntity<List<usermodel>>(viceser.getuserbyrole(erole.ETUDIANT),
                        HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/getens")
    public ResponseEntity<List<usermodel>> listens(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                return new ResponseEntity<List<usermodel>>(viceser.getuserbyrole(erole.ENSEIGNANT),
                        HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PutMapping("/generatcode")
    public ResponseEntity<usermodel> modmodule(@RequestParam String Id,
            @RequestBody usermodel updatedDocument, HttpSession session) {

        usermodel modifiedDocument = new usermodel();
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.VICE_DOYEN) {
                modifiedDocument = viceser.generatcode(Id, updatedDocument);
            }

            return ResponseEntity.ok(modifiedDocument);

        } catch (RuntimeException e) {
            // Handle the case when the document is not found or other error occurs
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}